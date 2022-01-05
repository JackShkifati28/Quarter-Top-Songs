/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vipclients;


public class Song {
    private String track;
    private Song next;
    
    public Song(Song play){
        next= play;
        
    }
    public String SongName(){
        return track;
    }
    
    public class playList {
        private Song first;
        
        public playList(){
            first=null;
        }
        
        public void addSong(Song s){
            
        }
        
        
    }
}
