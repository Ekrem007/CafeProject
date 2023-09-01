package Adapters;
/*public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        try {
            return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()), customer.getName().toUpperCase(), customer.getSurname().toUpperCase(), customer.getDateOfBirth());
        } catch (NumberFormatException | RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}*/
