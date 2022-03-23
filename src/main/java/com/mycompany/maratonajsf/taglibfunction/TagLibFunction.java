package com.mycompany.maratonajsf.taglibfunction;

import org.apache.commons.lang3.text.WordUtils;

/**
 *
 * @author Home
 */
public class TagLibFunction {
    public static String capitalize(String str) {
        return WordUtils.capitalizeFully(str);
    }
}
