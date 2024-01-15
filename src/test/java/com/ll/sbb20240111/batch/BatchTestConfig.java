package com.ll.sbb20240111.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchTestConfig {
    // 각 Job 마다 이 빈도 하나씩 등록해서 테스트케이스 구현할 때 사용하면 편리합니다.
    @Bean
    public JobLauncherTestUtils helloJobLauncherTestUtils(Job helloJob) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(helloJob);
        return utils;
    }

    // 각 Job 마다 이 빈도 하나씩 등록해서 테스트케이스 구현할 때 사용하면 편리합니다.
    @Bean
    public JobLauncherTestUtils hello2JobLauncherTestUtils(Job hello2Job) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(hello2Job);
        return utils;
    }

    @Bean
    public JobLauncherTestUtils hello3JobLauncherTestUtils(Job hello3Job) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(hello3Job);
        return utils;
    }

}