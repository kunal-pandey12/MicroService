package com.lcwd.hotel.excepations;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExcepation {

    public ResponseEntity<Map<String ,Object>>notFoundHandler(ResourceNotfoundException ex){
        Map map = new HashMap();
        map.put("msg" ,ex.getMessage());
        map.put("success",false);
        map.put("status", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }

}
