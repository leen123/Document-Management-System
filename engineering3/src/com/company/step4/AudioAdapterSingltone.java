package com.company.step4;

import com.company.step3.AudioAdapter;
import com.company.step3.AudioLibrary;

public class AudioAdapterSingltone {
    static AudioAdapter audioAdapter;
    public  static AudioAdapter getInstance(){
        if(audioAdapter==null){
            audioAdapter=new AudioAdapter();
        }
        return audioAdapter;
    };
}
