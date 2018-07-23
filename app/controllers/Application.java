package controllers;
import models.Dataprod;
import play.api.templates.Html;
import play.mvc.*;
import views.html.*;
public class Application extends Controller {
    public static Result mian(Html content) {
        return ok(mian.render(content));
    }

    public static Result index() { return mian(home.render());}

    public static Result oder() {return mian(oder.render());}

    public static Result product() {
        return mian(product.render());
    }

    public static Result pormotions() {
        return mian(promotions.render());
    }

    public static Result register(){return mian(register.render());}

    public static Result Girl() {
        return mian(Girl.render());
    }
    /* public static Results dataemployee(){return{mian( dataemployee.render());{ */
           public static Result dtp(){

        Dataprod sd1=new Dataprod("p001","รองเท้า","cabio",300,2);
        Dataprod sd2 = new Dataprod("p002", "ถุงเท้า", "cabio", 350, 10.00);
        Dataprod sd3 = new Dataprod("p003", "ถุงน่อง", "cabio", 50, 10.00);
        Dataprod sd4 = new Dataprod("p004", "ถุงมือ", "cabio", 50, 10.00);
        Dataprod sd5 = new Dataprod("p005", "ปากกา", "cabio", 10, 5.00);
        Dataprod sd6 = new Dataprod("p006", "กระเป๋า", "cabio", 350, 2.00);
        return mian(shop.render(sd1,sd2,sd3,sd4,sd5,sd6));
    }


}








