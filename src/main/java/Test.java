import java.io.*;

public class Test {
    /**
     * Write the bytes from input stream to output stream.
     * The input stream and output stream are not closed.
     * @param is
     * @param os
     * @throws IOException
     */
    public  boolean copy(InputStream is, OutputStream os) throws IOException {


        int count = 0;
        //缺少空指针判断
        byte[] buffer = new byte[1024];
        while ((count = is.read(buffer)) >= 0) {
            os.write(buffer, 0, count);
        }
        //未关闭I/O流
        return true;
    }  public void copy(String[] a, String[] b, String ending)
    {
        int index;
        String temp = null;
        //空指针错误
        System.out.println(temp.length());
        //未使用变量
        int length=a.length;
        //多余的if语句
        for(index=0; index<a.length; index++)
            if (true) {
                //对象比较 应使用equals
                if (temp == ending) {
                    break;
                }
                //缺少 数组下标越界检查
                b[index] = temp;
            }
    }
    /**
     *
     * @param file
     * @return file contents as string; null if file does not exist
     */
    public  void  readFile(File file) {
        InputStream is = null;
        OutputStream os = null;
        try {

            //未使用方法返回值
            copy(is,os);
            is.close();
            os.close();
        } catch (IOException e) {
            //可能造成I/O流未关闭
            e.printStackTrace();
        }
        finally
        {
            //空的try/catch/finally块
        }
    }

}
