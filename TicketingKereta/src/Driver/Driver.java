/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Console.Console;
import Model.Apk;

/**
 *
 * @author RH
 */
public class Driver {
    public static void main(String[] args) {
        Apk app = new Apk();
        Console console = new Console(app);
        console.menuUtama();
    }
}
