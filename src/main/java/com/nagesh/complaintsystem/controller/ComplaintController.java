package com.nagesh.complaintsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagesh.complaintsystem.model.Complaint;
import com.nagesh.complaintsystem.service.ComplaintService;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @PostMapping
    public Complaint submitComplaint(@RequestBody Complaint complaint) {
        return complaintService.submitComplaint(complaint);
    }

    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    @GetMapping("/user/{userId}")
    public List<Complaint> getComplaintsByUser(@PathVariable Long userId) {
        return complaintService.getComplaintsByUser(userId);
    }

    @GetMapping("/{id}")
    public Complaint getComplaintById(@PathVariable Long id) {
        return complaintService.getComplaintById(id);
    }
    

    @PatchMapping("/{id}/resolve")
    public Complaint markComplaintAsResolved(@PathVariable Long id) {
        return complaintService.markAsResolved(id);
    }
    
    

}
