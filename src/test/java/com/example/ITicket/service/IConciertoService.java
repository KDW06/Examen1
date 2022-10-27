
package com.example.ITicket.service;
import com.example.ITicket.entity.Concierto;
import java.util.List;


public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public void saveConcierto(Concierto concierto);
    public Concierto getConciertoById(long id);
    public void delete(long id);
}
