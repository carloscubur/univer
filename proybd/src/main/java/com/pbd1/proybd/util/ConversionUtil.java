package com.pbd1.proybd.util;

import org.modelmapper.ModelMapper;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by carloscubur on 8/09/17.
 */
public class ConversionUtil {

    private static final ModelMapper mapper = new ModelMapper();

    public static <T> T convert(Object source, Class<T> destinationType) {
        return mapper.map(source, destinationType);
    }

    public static <T, U> List<U> convert(List<T> source, Class<U> destinationType) {
        List<U> mapList = new ArrayList<U>();
        for (T item: source) {
            U destiny = convert(item, destinationType);
            mapList.add(destiny);
        }
        return mapList;
    }

}
