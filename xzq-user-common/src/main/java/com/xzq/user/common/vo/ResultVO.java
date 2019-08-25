package com.xzq.user.common.vo;

import lombok.Data;

@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private Boolean success;
    private T data;

    public static <T> ResultVO<T>  newSuccessResult(T dada){
        ResultVO resultVO = new ResultVO<>();
        resultVO.setCode(1);
        resultVO.setMsg("success");
        resultVO.setSuccess(true);
        resultVO.setData(dada);

        return resultVO;
    }

    public static <T> ResultVO<T>  newSuccessResult(){
        ResultVO resultVO = new ResultVO<>();
        resultVO.setCode(1);
        resultVO.setMsg("success");
        resultVO.setSuccess(true);
        resultVO.setData(null);

        return resultVO;
    }

    public static  ResultVO  newFailResult(String msg){
        ResultVO resultVO = new ResultVO<>();
        resultVO.setCode(0);
        resultVO.setMsg(msg);
        resultVO.setSuccess(false);

        return resultVO;
    }
}
