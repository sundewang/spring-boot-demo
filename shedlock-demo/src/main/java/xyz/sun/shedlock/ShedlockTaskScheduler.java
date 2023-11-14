package xyz.sun.shedlock;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 参考自https://zhuanlan.zhihu.com/p/403824645
 *
 * @author sundewang
 * @date 2023/11/13
 */
@Component
public class ShedlockTaskScheduler {

    @Scheduled(cron = "0 0/1 * * * ?")
    @SchedulerLock(name = "scheduledTaskName", lockAtMostFor = "PT2M")
    public void scheduledTask1() throws InterruptedException {
        SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日：HH:mm:ss---SSS(毫秒)");
        String start = date.format(new Date(System.currentTimeMillis()));
        System.out.print(start + "：hello one，1!start");
        Thread.sleep(60000);
        String end = date.format(new Date(System.currentTimeMillis()));
        System.out.println(end + "：hello one，1!end");
    }

    @Scheduled(cron = "0 0/1 * * * ?")
    @SchedulerLock(name = "scheduledTaskName", lockAtMostFor = "PT2M")
    public void scheduledTask2() throws InterruptedException {
        SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日：HH:mm:ss---SSS(毫秒)");
        String start = date.format(new Date(System.currentTimeMillis()));
        System.out.print(start + "：hello two，2! start");
        Thread.sleep(60000);
        String end = date.format(new Date(System.currentTimeMillis()));
        System.out.println(end + "：hello two，2! end");
    }
}
