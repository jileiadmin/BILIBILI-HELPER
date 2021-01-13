package top.misec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import top.misec.login.ServerVerify;
import top.misec.login.Verify;
import top.misec.task.DailyTask;


/**
 * @author Junzhou Liu
 * @create 2020/10/11 2:29
 */
public class BiliMain {

    static Logger logger = (Logger) LogManager.getLogger(BiliMain.class.getName());

    public static void main(String[] args) {

        if (args.length < 3) {
            logger.info("任务启动失败");
            logger.warn("Cookies参数缺失，请检查是否在Github Secrets中配置Cookies参数");
        }
        //读取环境变量
        logger.info(args[0]);
        logger.info(args[1]);
        logger.info(args[2]);
        logger.info(args[3]);
//         Verify.verifyInit(args[0], args[1], args[2], args[3]);

//         if (args.length > 4) {
//             ServerVerify.verifyInit(args[4]);
//         }
        Verify.verifyInit("437218043", "e3c8425c%2C1620522526%2C1016d*b1", "0095068659361a624843c0a9935c993a", "73E4E439-EA0E-4413-ABBF-393BE3194E01143099infoc");


        //每日任务65经验
        logger.debug("任务启动中");
        DailyTask dailyTask = new DailyTask();
        dailyTask.doDailyTask();
    }

}
