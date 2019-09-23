import cats.effect.ExitCode
import io.chrisdavenport.log4cats.Logger
import io.chrisdavenport.log4cats.slf4j.Slf4jLogger
import monix.eval.{Task, TaskApp}
import monix.execution.Scheduler.Implicits.global

object Main extends TaskApp {
  implicit def log: Logger[Task] = Slf4jLogger.getLogger[Task]

  override def run(args: List[String]): Task[ExitCode] =
    for {
      _ <- log.info("Hello, World!")
    } yield ExitCode.Success
}
