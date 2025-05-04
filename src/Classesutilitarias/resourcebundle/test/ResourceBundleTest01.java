package Classesutilitarias.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

// aula 130 - resourceBundle
public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.getDefault());
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("messages", Locale.US);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        // Locale("fr", "CA");
        //messages_fr_CA.properties;
        //messages_fr.properties;
        //messages_en_US.properties;
        //messages_en.properties;
        //messages.properties;
        System.out.println(bundle.getString("hi"));
    }
}
