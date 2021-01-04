package com.notfication.services;

import com.notfication.model.NotificationTemplate;
import com.notfication.repo.NotificationFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotificationServices {
    List<NotificationTemplate> templates = new ArrayList<NotificationTemplate>();

    NotificationFunctions notificationFunctions;
    @Autowired
    public NotificationServices(@Qualifier("repo")NotificationFunctions notificationFunctions) {
        this.notificationFunctions = notificationFunctions;
    }

    public List<NotificationTemplate> getAllTemplates(){
        //return templates;
        List<NotificationTemplate> n= this.notificationFunctions.findAll();
        return n;
    }
    public void add(NotificationTemplate template){
       //templates.add(template);
       this.notificationFunctions.save(template);
    }
    public void delete(int templateID){

        //templates.remove(templateID);
        this.notificationFunctions.deleteById(templateID);
    }
    public void update(int templateID,NotificationTemplate template){

        List<NotificationTemplate> n= this.notificationFunctions.findAll();
        this.notificationFunctions.deleteAll();
        n.remove(templateID);
        n.add(templateID,template);
        /*int i=0;
        while (n.size()!= 0){
            this.notificationFunctions.save(n.get(i));
            i++;
        }*/
        this.notificationFunctions.saveAll(n);
    }
    public NotificationTemplate get(int templateID){
        //return templates.get(templateID);
        int i = templateID-1;
        List<NotificationTemplate> n= this.notificationFunctions.findAll();
        NotificationTemplate temp = n.get(i);
        return temp;

    }


    /*
    private final NotificationFunctions notificationFunctions;

    @Autowired
    public NotificationServices(@Qualifier("NotificationRepo") NotificationFunctions notificationFunctions) {
        this.notificationFunctions = notificationFunctions;
    }
    public void add(NotificationTemplate template){
        notificationFunctions.addTemplate(template);
    }
    public void delete(int templateID){
        notificationFunctions.deleteTemplate(templateID);
    }
    public void update(NotificationTemplate template){
        notificationFunctions.updateTemplate(template);
    }
    public NotificationTemplate get(int templateID){
        return notificationFunctions.getTemplate(templateID);
    }
    public List<NotificationTemplate> getAllTemplates(){
        return notificationFunctions.getAll();
    }*/

}
