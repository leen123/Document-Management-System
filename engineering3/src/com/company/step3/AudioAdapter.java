package com.company.step3;

import com.company.step2.AudioFile;

public class AudioAdapter {
    AudioLibrary audioLibrary;
    public  void play(AudioFile audioFile){
        audioLibrary=new AudioLibrary();
        audioLibrary.setName(audioFile.getName());
        audioLibrary.play();
    }
}
