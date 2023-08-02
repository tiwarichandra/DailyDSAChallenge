package com.tiwari.daily_dsa;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


class Job
{
    public int taskId, deadline, profit;

    public Job(int taskId, int deadline, int profit)
    {
        this.taskId = taskId;
        this.deadline = deadline;
        this.profit = profit;
    }
}


public class JobSequence {

    public static void findMaximumProfit(List<Job> jobs, int maxDeadline)
    {
        AtomicInteger tempProfit = new AtomicInteger();

        int[] slot = new int[maxDeadline];
        Arrays.fill(slot, -1);

        jobs.sort((a, b) -> b.profit - a.profit);


        jobs.forEach(job -> {
            for (int j = job.deadline - 1; j >= 0; j--)
            {
                if (j < maxDeadline && slot[j] == -1)
                {
                    slot[j] = job.taskId;
                    tempProfit.addAndGet(job.profit);
                    break;
                }
            }
        });
//        for (Job job: jobs)
//        {
//            for (int j = job.deadline - 1; j >= 0; j--)
//            {
//                if (j < maxDeadline && slot[j] == -1)
//                {
//                    slot[j] = job.taskId;
//                    tempProfit += job.profit;
//                    break;
//                }
//            }
//        }

        System.out.println("The scheduled jobs are " +
                Arrays.stream(slot).filter(val -> val != -1).boxed()
                        .toList());

        System.out.println("The total tempProfit earned is " + tempProfit);
    }


    public static void main(String[] args) {

        // List of given jobs. Each job has an identifier, a deadline, and
        // profit associated with it
        List<Job> jobs = Arrays.asList(
                new Job(1, 9, 15), new Job(2, 2, 2), new Job(3, 5, 18),
                new Job(4, 7, 1), new Job(5, 4, 25), new Job(6, 2, 20),
                new Job(7, 5, 8), new Job(8, 7, 10), new Job(9, 4, 12),
                new Job(10, 3, 5));

        final int maxDeadline = 9;


        findMaximumProfit(jobs, maxDeadline);
    }
}
