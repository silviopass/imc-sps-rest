package imc.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/imcjaxrs")
public class ImcJaxRs {

	@GET
	@Path("/calcular")
	@Produces("application/json")
	public Calculo calcular(
                @QueryParam("altura") double altura, 
	  	@QueryParam("sexo") double peso,
		@QueryParam("to") String sexo)    
        {   
            Calculo c;
            c = new Calculo(altura, peso, sexo);
            c.calcular();
            return c;
	}
}