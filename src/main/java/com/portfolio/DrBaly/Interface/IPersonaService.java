
package com.portfolio.DrBaly.Interface;

import com.portfolio.DrBaly.Entity.Persona;
import java.util.List;





public interface IPersonaService {
    
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    
    public void deletePersona(Long id);
    
    //Buscar un persona por ID
    public Persona findPersona(Long id);
    
    
}
