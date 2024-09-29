package pe.edu.cibertec.sw_async_hilos.remote.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.sw_async_hilos.service.AtencionService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
public class AsyncTaskService {
    private static final Logger log = LoggerFactory.getLogger(AtencionService.class);

    @Async
    public CompletableFuture<String> operacionPagoOnline() {
        try{
            log.info("Iniciando proceso de pago");
            TimeUnit.SECONDS.sleep(4);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture("Pago exitoso");
    }

    @Async
    public CompletableFuture<String> operacionRegistroVentas() {
        try{
            log.info("Iniciando registro de ventas");
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture("Registro de venta exitoso");
    }

    @Async
    public CompletableFuture<String> operacionActualizacionCompras() {
        try {
            log.info("Iniciando actualizacion de compras");
            TimeUnit.SECONDS.sleep(7);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture("Compra actualizaco");
    }
}
