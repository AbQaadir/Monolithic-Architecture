package com.example.ytpractice.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void creatJob(Job job);
}