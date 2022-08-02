import java.io.*;

public class Colton_Kelsey_Crypto {


    public  void encryptFile(String existing, String encrypted){

    boolean eof = false;

    
    FileInputStream inStream = new FileInputStream("src\\MyLetters.txt");
    DataInputStream inData = new DataInputStream (new FileInputStream("src\\MyLetters.txt"));

    //FilterOutputStream outStream = new FileOutputStream(encrypted);
    DataOutputStream OutFile = new DataOutputStream(new FileOutputStream("src\\Encrypted.txt"));

    while (!eof)

    try{ byte input = inData.readByte();
    input += 15;

    OutFile.writeByte(input);
    }

    catch (EOFException e)
    {
        eof = true;
    }
    catch(IOException e)
    {
        System.out.println("IOException");
    }
}
}
