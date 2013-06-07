/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadews;

import javax.ejb.Stateless;
import javax.jws.WebService;
import model.Payment;
import model.ProcessResult;
import model.ROb;
import services.AdminBankPayments;

/**
 *
 * @author NicolasR
 */
@WebService(serviceName = "AppointmentChargeTransfer")
@Stateless()
public class AppointmentChargeTransfer {

    public ProcessResult AppoinmentChargeTransfer(Payment payment) {

        return new AdminBankPayments().appointmentChargeTransfer(payment);
    }
}
