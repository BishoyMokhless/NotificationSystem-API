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
        return notificationFunctions.findAll();
    }
    public void add(NotificationTemplate template){
       templates.add(template);
       notificationFunctions.save(template);
    }
    public void delete(int templateID){
        templates.remove(templateID);
        notificationFunctions.deleteById(templateID);
    }
    public void update(NotificationTemplate template){

        notificationFunctions.save(template);
    }
    public NotificationTemplate get(int templateID){
        //return templates.get(templateID);
        return notificationFunctions.findById(templateID).orElseThrow(null);
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
