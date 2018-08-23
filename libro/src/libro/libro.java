
package libro;

 public class libro {
    
    private String _editorial;
    private String _autor;
    private String _titulo;
    private int _nopag;
    private String _propietario;
    private int _año;
    private int _mes;
    private int _dia;
    private String _edición;
    private String _pais;
    private int _volumen;

    public String getEditorial() {
        return _editorial;
    }

    public void setEditorial(String _editorial) {
        this._editorial = _editorial;
    }

    public String getAutor() {
        return _autor;
    }

    public void setAutor(String _autor) {
        this._autor = _autor;
    }

    public String getTitulo() {
        return _titulo;
    }

    public void setTitulo(String _titulo) {
        this._titulo = _titulo;
    }

    public int getNopag() {
        return _nopag;
    }

    public void setNopag(int _nopag) {
        this._nopag = _nopag;
    }

    public String getPropietario() {
        return _propietario;
    }

    public void setPropietario(String _propietario) {
        this._propietario = _propietario;
    }

    public int getAño() {
        return _año;
    }

    public void setAño(int _año) {
        this._año = _año;
    }

    public int getMes() {
        return _mes;
    }

    public void setMes(int _mes) {
        this._mes = _mes;
    }

    public int getDia() {
        return _dia;
    }

    public void setDia(int _dia) {
        this._dia = _dia;
    }

    public String getEdición() {
        return _edición;
    }

    public void setEdición(String _edición) {
        this._edición = _edición;
    }

    public String getPais() {
        return _pais;
    }

    public void setPais(String _pais) {
        this._pais = _pais;
    }

    public int getVolumen() {
        return _volumen;
    }

    public void setVolumen(int _volumen) {
        this._volumen = _volumen;
    }
    //constructores
    public libro(){   
    }

    public libro(String _editorial, String _autor, String _titulo, int _nopag, String _propietario, int _año, int _mes, int _dia, String _edición, String _pais, int _volumen) {
        this._editorial = _editorial;
        this._autor = _autor;
        this._titulo = _titulo;
        this._nopag = _nopag;
        this._propietario = _propietario;
        this._año = _año;
        this._mes = _mes;
        this._dia = _dia;
        this._edición = _edición;
        this._pais = _pais;
        this._volumen = _volumen;
    }
    public libro(String editorial,String autor){
        
        this._editorial=editorial;
        this._autor=autor;
    }
    
    public libro(String titulo,int nopag){
        
        this._titulo=titulo;
        this._nopag=nopag;
    }
    public libro(String propietario, String edicion, int volumen){
        
        this._propietario=propietario;
        this._edición=edicion;
        this._volumen=volumen;
    }
    public libro(int año,int mes, int dia){
        
        this._año=año;
        this._mes=mes;
        this._dia=dia;
    }
    public libro(String pais){
        this._pais=pais;
    }

    @Override
    public String toString() {
        return "libro{" + "_editorial=" + _editorial + ", _autor=" + _autor + ", _titulo=" + _titulo + ", _nopag=" + _nopag + ", _propietario=" + _propietario + ", _a\u00f1o=" + _año + ", _mes=" + _mes + ", _dia=" + _dia + ", _edici\u00f3n=" + _edición + ", _pais=" + _pais + ", _volumen=" + _volumen + '}';
    }
    
}
