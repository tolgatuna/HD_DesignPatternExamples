/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hf_dp_ch5_singletonpattern;

/**
 *
 * @author Tolga
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance = null;

    private ChocolateBoiler() {
        empty   = true;
        boiled  = false;
    }
    
    /* 
     *   synchronized : tüm threadler'in sıra ile işlem yapması için gerekli.
     * Aksi halde birden fazla örnek oluşturma ihtimalimiz doğar.
     *   Yada bunun yerine private static ChocolateBoiler instance = null; yazmayıp
     * private static ChocolateBoiler instance = new ChocolateBoiler(); yazarak
     * objeyi en başta oluşturmak ve direk return etmek mümkün. Tabi kullanmıycaksak
     * boşa oluşturmuş olucağız.
     * 
     *   Yada bunlarında yerine ;
     * private volatile static ChocolateBoiler instance = null; 
     * public static ChocolateBoiler getInstance() {
     *   if(instance == null) {
     *       synchronized (ChocolateBoiler.class)
     *       if(instance == null) {
     *           instance = new ChocolateBoiler();
     *       }
     *   }
     *   return instance;
     * }
     * yazarak sadece oluşturma anında senkronize çalışma
     * sağlamak mümkün
     *
     */
    public static synchronized ChocolateBoiler getInstance() {
        if(instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

}
