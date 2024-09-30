/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import beans.Site;
import static ma.projet.test.Test.load;
import static ma.projet.test.Test.save;

/**
 *
 * @author hp
 */
public class Main {
   // public static void main(String[] args) {

       // save(new Site("SAFI"));
        //save(new Site("MARRAKECH"));
        //save(new Site ("EL JADIDA"));
   //}
    public static void main(String[] args) {

      save(new Site("SAFI"));
      save(new Site("MARRAKECH"));
      save(new Site ("EL JADIDA"));

       load();
}

}
