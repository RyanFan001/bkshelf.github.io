package com.yan.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * image
 * @author Administrator
 *
 */
@Controller
@RequestMapping("upload")
public class UploadFile {
	/**
     * upload image
     * @return {Result}
     */
    @RequestMapping(value = "/uploadImg", method = {RequestMethod.POST})
    @ResponseBody
    public Object uploadImg(@RequestParam(value="file",required=false) MultipartFile file, HttpServletRequest request) throws Exception {
        String prefix="";
        String dateStr="";
        //save and uplaod
        try{
            if(file!=null){
                String originalName = file.getOriginalFilename();
                prefix=originalName.substring(originalName.lastIndexOf(".")+1);
                dateStr = String.valueOf(new Date().getTime());
                String filepath = request.getServletContext().getRealPath("/upload/") + dateStr + "." + prefix;
                System.out.println(filepath+"==============================");
                //String filepath = "D:/upload/" + dateStr + "." + prefix;
                filepath = filepath.replace("\\", "/");
                File files=new File(filepath);
                //print path
                System.out.println(filepath);
                if(!files.getParentFile().exists()){
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);
            }
        }catch (Exception e){
        }
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","upload successful");
        map.put("src","/upload/" + dateStr + "." + prefix);
        return map;
    }
    
   
}
