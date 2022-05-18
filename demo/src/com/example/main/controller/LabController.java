package com.example.main.controller;

import com.example.main.bean.LabBean;
import com.example.main.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.List;

@Controller
@ResponseBody
public class LabController {

    @Autowired
    public XmlWebApplicationContext applicationContext;
    public final LabService labService;
    @Autowired
    public LabController(LabService labService) {

        this.labService = labService;
    }
    @Autowired
    @RequestMapping("/selectAll")
    private List<LabBean> selectAll() {

        WebApplicationContext currentWebApplicationContext = ContextLoader.getCurrentWebApplicationContext( );
        String[] beanDefinitionNames1 = currentWebApplicationContext.getBeanDefinitionNames( );
        for (String s :
                beanDefinitionNames1) {
            System.out.println("parent: "+s );
        }



        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames( );
        for (String s  :
              beanDefinitionNames) {
            System.out.println("son: "+s );
        }

        return labService.selectAll();
    }
}
