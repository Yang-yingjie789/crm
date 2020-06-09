package ntt.global.crm.controller;

import ntt.global.crm.util.VerifyCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/6 18:28
 */
@Controller
@RequestMapping("/verify")
public class VerfiyCodeController {

    //@Operation(name="获取验证码")
    @RequestMapping("/getVerifyCode")
    public void getVerifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");

        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        System.out.println(verifyCode);
        //存入会话session
        request.getSession(true).setAttribute("rand", verifyCode.toLowerCase());
        //生成图片
        int w = 200, h = 80;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

}
