
package com.example.ITicket.service;
import com.example.ITicket.entity.Concierto;
import java.util.List;
import com.example.ITicket.repository.ConciertoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ConciertoService implements IConciertoService{
      
    @Autowired
    private ConciertoRepository conciertoRepository;
    
    @Override
    public List<Concierto> getAllConcierto() {
            return (List<Concierto>)conciertoRepository.findAll();
    }

    @Override
    public void saveConcierto(Concierto concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public Concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }
}
