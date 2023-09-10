package com.example.test_task_sibdigital.controller;

import com.example.test_task_sibdigital.exception.ArrayNotFoundException;
import com.example.test_task_sibdigital.model.Result;
import com.example.test_task_sibdigital.model.SortedValue;
import com.example.test_task_sibdigital.repository.ResultRepository;
import com.example.test_task_sibdigital.service.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {

    private final Service service;
    private final ResultRepository resultRepository;

    public Controller(Service service, ResultRepository resultRepository) {
        this.service = service;
        this.resultRepository = resultRepository;
    }

    @RequestMapping(value = {"/", "/getValuesToSortView"})
    public String showView() {
        return "getValuesToSortView";
    }

    @RequestMapping(value = "/showSortedArray")
    public String showSortedArray(@RequestParam String array, Model model) {
        Long[] longArray = service.getLongArrayFromString(array);
        service.bubbleSort(longArray);

        Result result = new Result();
        ArrayList<SortedValue> sortedList = new ArrayList<>();
        for (int i = 0; i < longArray.length; i++) {
            SortedValue temp = new SortedValue(longArray[i], result);
            sortedList.add(temp);
        }
        result.setArrayValues(sortedList);
        model.addAttribute("result", result);
        resultRepository.save(result);
        return "showSortedArray";
    }

    @GetMapping(value = "/getSortedArray")
    public String getSortedArray(@RequestParam(name = "id") Long id, Model model) {
        Result result = resultRepository.findById(id).orElseThrow(
                () -> new ArrayNotFoundException("Массив с идентификатором " + id + " не найден")
        );
        model.addAttribute("result", result);
        return "showSortedArray";
    }
}
