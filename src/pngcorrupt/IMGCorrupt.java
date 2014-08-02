/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pngcorrupt;
import java.util.Random;
import java.io.*;
/**
 * Corrupts image Files
 * @author Paul Alves
 */
public class IMGCorrupt {
    private long seed;
    private int maxbytes;// = 15800;
    private long offset;
    private File superF;
    private byte[] corruptBytes;
    private int openFile;
    
    /**
     * Creates a new PNGCorrupt object
     * @param f File to corrupt
     * @param pSeed Randomizer seed
     * @param bytes How many bytes to corrupt
     * @param pOffset How much of an offset to corrupt from (excluding header and boring stuff)
     * @throws FileNotFoundException
     */
    public IMGCorrupt(File f, long pSeed, int bytes, long pOffset) throws FileNotFoundException{
    superF = f;
    seed = pSeed;
    maxbytes = bytes;
    offset = pOffset;
    }
    
    /**
     * Sets the randomization seed
     * @param pSeed The seed to set
     */
    public void setSeed(long pSeed){
    seed = pSeed;
    }
    
    /**
     * Sets how many bytes to corrupt
     * @param pBytes The max amount of bytes to corrupt (default is 15800)
     */
    public void setMaxBytes(int pBytes){
    if(pBytes == 0){maxbytes = 1580;}
    else{maxbytes = pBytes;}
    }
    
    /**
     * Sets how many bytes into the file to corrupt
     * @param pOff How many bytes to skip
     */
    public void setOffset(long pOff){
    offset = pOff;
    }
    
    /**
     * Corrupts this file
     * @throws IOException
     */
    public void corrupt() throws IOException{
    Random r;
    if(seed == 0){r = new Random();}
    else{r = new Random(seed);}
    RandomAccessFile PNGFile = new RandomAccessFile(superF,"rw");
    PNGFile.seek(offset);
    corruptBytes = new byte[maxbytes];
    r.nextBytes(corruptBytes);
    PNGFile.write(corruptBytes);
    PNGFile.close();
    }
}
