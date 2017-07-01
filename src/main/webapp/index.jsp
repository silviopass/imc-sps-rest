<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset= utf-8>
        <title>Calculadora IMC (Versão Rest)  </title>
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
        <style>
            h1 {
                 text-align: center;
                 margin-bottom: 5%;
            }
            body {
                padding-top: 0px;
                font-size: 12px;
                background: #708090; 
            }

            .container {
                margin: 0 auto;
                max-width: 1024px;
                width: 70%;
                width: 90%;
                margin-top: 10%;
                background: #FFF;
                padding: 2%;
                border: 1px solid #d0d0d0; 
                border-radius:7px;                 
            }
                        
            .alert-custom {
                font-size: 20px;
                color: #B22222;
                text-align: center;
            }

        </style>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        
        <script>
            function calcular() {             
                $.ajax({
                    dataType: "json",
                    url: "http://localhost:9090/imc/imc-sps-rest?altura=" + document.forms["formulario"].elements["altura"].value + "&peso=" + document.forms["formulario"].elements["peso"].value + "&sexo=" + document.forms["formulario"].elements["sexo"].value
                }).then(function(data) {
                    alert(data.resultado);
                });
            }
        </script>
         
        
    </head>
   
    
    <body>

        <div class="container">

            <h1>Calculadora IMC (Rest)</h1>

            <div class="row">
                <form name="formulario" class="form-horizontal">

                    <fieldset>		

                        <div class="form-group">
                            <label class="col-md-4 control-label" for="textinput">Altura</label>  
                            <div class="col-md-4">
                                <input id="altura" name="altura" type="number" step="0.01" placeholder="altura em metros ex. 1.75 " class="form-control input-md" required="" value="${param.altura}" placeholder="Informe a altura">                                    
                            </div>
                        </div>                  

                        <div class="form-group">
                            <label class="col-md-4 control-label" for="textinput">Peso</label>  
                            <div class="col-md-4">
                                <input id="peso" name="peso"  type="number" step="0.01"  placeholder="peso" class="form-control input-md" required="" value="${param.peso}" placeholder="Informe o peso">
                            </div>
                        </div>                            

                            <div class="form-group">
                                <label class="col-md-4 control-label" for="selectbasic">Sexo</label>
                                <div class="col-md-4">
                                    <select name="sexo" class="form-control">
                                        <option value="M">Masculino</option>
                                        <option value="F">Feminino</option>
                                    </select>
                                </div>
                            </div>                    

                        <div class="form-group">
                            <label class="col-md-4 control-label" for="button1id"></label>
                            <div class="col-md-8">                                
                                <!-- <button type="submit" id="button1id" name="button1id" class="btn btn-success">Calcula</button> -->
                                <!-- <button type="reset"  id="button2id" name="button2id"  class="btn btn-danger">Limpa</button> -->
                                <button type="button" class="btn btn-sm btn-success" onclick="calcular()">Calcular</button>                                
                            </div>
                        </div>

                    </fieldset>
                                        
                </form>
            </div>                     

        </div>

    </body>
</html>
