package ExceptionLearning;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionPractice {
    public static void main(String[] args) {

        try {
            fileExists();
            sqlExists();
        } catch (IOException ioException) {
            System.out.println("파일이 없습니다.");
        } catch (SQLException sqlException) {
            System.out.println("db가 없습니다.");
        }
    }

    public static boolean fileExists() throws IOException{

        // 파일 있는지 확인

        return false;
    }

    public static boolean sqlExists() throws SQLException {

        // db에서 있는지 확인

        return false;
    }
}
