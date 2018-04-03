package lab4;

import lab1and2.models.Figure;
import lab1and2.models.Rectangle;
import sun.plugin.security.PluginClassLoader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
/*        Figure figure = new Rectangle();
        while(true){
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            figure.draw();

        }*/
/*        ExtensionLoader<Geometric> loader = new ExtensionLoader<Geometric>();
        try {
            Geometric somePlugin = loader.LoadClass("lib", "plugin/Circle", Geometric.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        ClassLoader pluginLoader = null;
        try {
            pluginLoader = new PluginClassLoader(new File("lib").toURI().toURL());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Class<?> pluginClass = null;
        try {
            pluginClass = pluginLoader.loadClass("lab1and2.models.Rectangle");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Figure plugin = (Figure) pluginClass.newInstance();
            plugin.draw();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
