package com.ToTheListe2.To_the_liste.controller;
import com.ToTheListe2.To_the_liste.model.Task;
import com.ToTheListe2.To_the_liste.repo.Taskrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Taskcontroller {
    @Autowired
    Taskrepo taskrepo;
    @GetMapping("/getAlltasks")
    public ResponseEntity <List<Task>> getAllTasks()
    {
        try{
            List<Task> taskList = new ArrayList<>();
            taskrepo.findAll().forEach(taskList::add);
            if (taskList.isEmpty())
            {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(taskList,HttpStatus.OK);

        }catch (Exception ex)
        {
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
    @GetMapping("/getTaskById/{id}")
    public ResponseEntity<Task> getBookById(@PathVariable Long id) {
        Optional<Task> TaskObj = taskrepo.findById(id);
        if (TaskObj.isPresent()) {
            return new ResponseEntity<>(TaskObj.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addTask")
    public ResponseEntity<Task> addBook(@RequestBody Task task) {
        try {
            Task TaskObj = taskrepo.save(task);
            return new ResponseEntity<>(TaskObj, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/updateTask/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        try {
            Optional<Task> taskData = taskrepo.findById(id);
            if (taskData.isPresent()) {
                Task updatedTaskData = taskData.get();
                updatedTaskData.setTitle(task.getTitle());
                updatedTaskData.setDescription(task.getDescription());

                Task taskObj = taskrepo.save(updatedTaskData);
                return new ResponseEntity<>(taskObj, HttpStatus.CREATED);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/deleteTaskById/{id}")
    public ResponseEntity<HttpStatus> deleteTask(@PathVariable Long id) {
        try {
            taskrepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/deleteAllTasks")
    public ResponseEntity<HttpStatus> deleteAllBooks() {
        try {
            taskrepo.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }







}
