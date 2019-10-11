package com.xzg.web;


import com.xzg.util.FastDFSClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class UploadfileController {

    @ResponseBody
    @RequestMapping(value = "/uploadfile",method = RequestMethod.POST)
    public String  uploadfile(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "editormd-image-file", required = false) MultipartFile attach){
        String  filePath = "";
        try {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "text/html");
            String confUrl=this.getClass().getClassLoader().getResource("fdfs_client.properties").getPath();
            FastDFSClient fastDFSClient=new FastDFSClient("/opt/fdfs_client.properties");
            //上传文件
            filePath   = fastDFSClient.uploadFile(attach.getBytes());
            System.out.println("返回路径："+filePath);
            return  "{\"success\": 1, \"message\":\"上传成功\",\"url\":\"http://106.14.212.62:9999/" + filePath + "\"}" ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
