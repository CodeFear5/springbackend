package com.nagesh.complaintsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagesh.complaintsystem.model.Assignment;
import com.nagesh.complaintsystem.service.AssignmentService;

@RestController
@RequestMapping("/api/assignments")
@CrossOrigin
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping
    public Assignment assignComplaint(@RequestParam Long complaintId, @RequestParam Long staffId) {
        return assignmentService.assignComplaint(complaintId, staffId);
    }

    @GetMapping
    public List<Assignment> getAllAssignments() {
        return assignmentService.getAllAssignments();
    }

    @GetMapping("/staff/{staffId}")
    public List<Assignment> getAssignmentsByStaff(@PathVariable Long staffId) {
        return assignmentService.getAssignmentsByStaff(staffId);
    }
}
