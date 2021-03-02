import cats.effect._

object Main extends IOApp.Simple {

  override def run: IO[Unit] =
    for {
      _ <- IO.println("Hello, World!")
    } yield ()
}
