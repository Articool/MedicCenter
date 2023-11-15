package ru.medcenter.ui.forms;

import org.openqa.selenium.By;
import ru.medcenter.selenium.Element;

public class LoginForm implements UIForm {

    public Element login(){
        return new Element(By.id("SP101_USERNAME"));
    }

    public Element password(){
        return new Element(By.id("SP101_PASSWORD"));
    }

    public Element buttonEnter(){
        return new Element(By.id("P101_LOGIN"));
    }
}
