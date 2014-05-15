/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package producerfields.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author ulidder
 */
@Stateless
public class SampleBean {

    public String getMessage(){
        return "hello world!";
    }
}
