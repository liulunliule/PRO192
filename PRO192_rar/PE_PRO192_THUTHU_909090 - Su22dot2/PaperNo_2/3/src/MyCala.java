
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.util.*;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
//PE_SU22_DOT3
//PE_SU22_DOT3
//PE_SU22_DOT3
//PE_SU22_DOT3
//PE_SU22_DOT3
//PE_SU22_DOT3
//PE_SU22_DOT3
//PE_SU22_DOT3
//PE_SU22_DOT3  
public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getOwner().length() >= 2) {
                if ((t.get(i).getOwner().charAt(1) >= '0' && (t.get(i).getOwner().charAt(1) <= '9'))) {
                    if (t.get(i).getOwner().charAt(1) % 2 == 0) {
                        count++;
                    }

                }
            }
        }
        return count;
    }

}
