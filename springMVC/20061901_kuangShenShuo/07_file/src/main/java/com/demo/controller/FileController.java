package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@RestController
public class FileController {
    @PostMapping("/upload")
    public String upload(@RequestParam("file")CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        //上传路径保存设置
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println("path:"+path);
        File realPath=new File(path);
        if(!realPath.exists()){
            realPath.mkdir();
        }
        System.out.println("realPath:"+realPath);
        //通过CommonsMultipartFile的方法直接写文件
        file.transferTo(new File(realPath+"/"+file.getOriginalFilename()));
        return "上传成功！";
    }
    @RequestMapping("/download")
    public String downloads(HttpServletResponse response,HttpServletRequest request) throws Exception{
        //要下载的图片的地址
        String path=request.getServletContext().getRealPath("/upload");
        String fileName="简历（韦俊杰）.pdf";
        //设置响应头
        response.reset();//设置页面不缓存，清空buffer
        response.setCharacterEncoding("UTF-8");//字符编码
        response.setContentType("multipart/form-data");//二进制传输数据
        response.setHeader("Content-Disposition",
                "attachment:fileName="+ URLEncoder.encode(fileName,"UTF-8"));
        File file = new File(path,fileName);
        //读取文件--输入流
        InputStream input = new FileInputStream(file);
        //写出文件--输出流
        OutputStream out = response.getOutputStream();

        byte[] buff = new byte[1024];
        int index=0;
        //执行写操作
        while((index=input.read(buff))!=-1){
            out.write(buff,0,index);
            out.flush();
        }
        out.close();
        input.close();
        return "下载成功";
    }
}
