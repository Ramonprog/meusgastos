package com.example.meusgastos.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateTime {

    public static String convertDate(Date data) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        return formatter.format(data);
    }

}
