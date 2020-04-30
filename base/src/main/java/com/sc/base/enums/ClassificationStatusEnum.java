package com.sc.base.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Getter
public enum ClassificationStatusEnum {

    CLOTHES("clothes","衣服");

    private String type;
    private String name;


    ClassificationStatusEnum(String status, String name) {
        this.type = status;
        this.name = name;
    }

    public static ClassificationStatusEnum getTypes(String status) {
        for (ClassificationStatusEnum whetherValidEnum : ClassificationStatusEnum.values()) {
            if (whetherValidEnum.getType().equals(status)) {
                return whetherValidEnum;
            }
        }
        return null;
    }
    public static String getTypesName(String status) {
        for (ClassificationStatusEnum whetherValidEnum : ClassificationStatusEnum.values()) {
            if (whetherValidEnum.getType().equals(status)) {
                return whetherValidEnum.getName();
            }
        }
        return null;
    }

    public static List<ClassificationStatusEnum> getAllEnum(){
        List<ClassificationStatusEnum> list= Arrays.asList();
        for (ClassificationStatusEnum whetherValidEnum : ClassificationStatusEnum.values()) {
            list.add(whetherValidEnum);
        }
        return list;
    }

    public static List<ClassificationStatusEnum> getEnumTypesBylikeType(String type){
        List<ClassificationStatusEnum> list=  getAllEnum();
        return list.stream().filter(o->o.getType().contains(type)).collect(Collectors.toList());
    }

}