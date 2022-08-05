package com.constructora.constructora.controlador;

import com.constructora.constructora.modelos.dao.PrimerInformeDao;
import com.constructora.constructora.modelos.dao.SegundoInformeDao;
import com.constructora.constructora.modelos.dao.TercerInformeDao;
import com.constructora.constructora.modelos.vo.PrimerInformeVo;
import com.constructora.constructora.modelos.vo.SegundoInformeVo;
import com.constructora.constructora.modelos.vo.TercerInformeVo;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class InformesController implements Initializable {
    @FXML
    private Pane pnlStatus;
    @FXML
    private Text lbStatus;
    @FXML
    private Button btnSalir;
    @FXML
    private Button btnPrimerinforme;
    @FXML
    private Button btnSegundoInforme;
    @FXML
    private Button btnTercerInforme;
    @FXML
    private GridPane pnPrimerInforme;
    @FXML
    private GridPane pnSegundoInforme;
    @FXML
    private GridPane pnTercerInforme;

    //+++++++++++++++++++++ PRIMER INFORME FX ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @FXML
    private TableView<PrimerInformeVo> tablaLideres;
    @FXML
    private TableColumn<PrimerInformeDao,Integer> IDLider;
    @FXML
    private TableColumn<PrimerInformeDao,String> Nombre;
    @FXML
    private TableColumn<PrimerInformeDao,String> PrimerApellido;
    @FXML
    private TableColumn<PrimerInformeDao,String> CiudadResidencia;

    //+++++++++++++++++++++ SEGUNDO INFORME FX ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @FXML
    private TableView<SegundoInformeVo> tablaProyectos;
    @FXML
    private TableColumn<SegundoInformeDao,Integer> ID_Proyecto;
    @FXML
    private TableColumn<SegundoInformeDao,String> Constructora;
    @FXML
    private TableColumn<SegundoInformeDao,String> Numero_Habitaciones;
    @FXML
    private TableColumn<SegundoInformeDao,String> Ciudad;

    //+++++++++++++++++++++ TERCER INFORME FX ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    @FXML
    private TableView<TercerInformeVo> tablaCompras;
    @FXML
    private TableColumn<TercerInformeDao,Integer> ID_Compra;
    @FXML
    private TableColumn<TercerInformeDao,String> Proveedor;
    @FXML
    private TableColumn<TercerInformeDao,String> CiudadCompra;
    @FXML
    private TableColumn<TercerInformeDao,String> ConstructoraCompra;
    @FXML
    private TableColumn<TercerInformeDao,String> Banco_Vinculado;
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dataPrimerinforme();
        dataSegundoinforme();
        dataTercerinforme();
    }

    @FXML
    private void handleClicks(ActionEvent event){
        if(event.getSource() == btnPrimerinforme){
            lbStatus.setText("Primer informe");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(80,98,102), CornerRadii.EMPTY, Insets.EMPTY)));
            pnPrimerInforme.toFront();
        }else if(event.getSource() == btnSegundoInforme){
            lbStatus.setText("Segundo informe");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(80,98,102), CornerRadii.EMPTY, Insets.EMPTY)));
            pnSegundoInforme.toFront();
        }else if(event.getSource() == btnTercerInforme){
            lbStatus.setText("Tercer informe");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(80,98,102), CornerRadii.EMPTY, Insets.EMPTY)));
            pnTercerInforme.toFront();
        }else if(event.getSource() == btnSalir){
            Stage stage = (Stage) btnSalir.getScene().getWindow();
            stage.close();
        }
    }

    private void dataPrimerinforme(){
        //Traemos la tabla ObservableList del modelo
        var primerInofrmeDao = new PrimerInformeDao();
        ObservableList<PrimerInformeVo> proyectosLista = primerInofrmeDao.getPrimerInforme();

        IDLider.setCellValueFactory(new PropertyValueFactory<>("ID_Lider"));
        Nombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        PrimerApellido.setCellValueFactory(new PropertyValueFactory<>("Primer_Apellido"));
        CiudadResidencia.setCellValueFactory(new PropertyValueFactory<>("Ciudad_Residencia"));
        tablaLideres.setItems(proyectosLista);
    }

    private void dataSegundoinforme(){
        //Traemos la tabla ObservableList del modelo
        var segundoInformeDao = new SegundoInformeDao();
        ObservableList<SegundoInformeVo> proyectoslist = segundoInformeDao.getSegundoInforme();

        ID_Proyecto.setCellValueFactory(new PropertyValueFactory<>("ID_Proyecto"));
        Constructora.setCellValueFactory(new PropertyValueFactory<>("Constructora"));
        Numero_Habitaciones.setCellValueFactory(new PropertyValueFactory<>("Numero_Habitaciones"));
        Ciudad.setCellValueFactory(new PropertyValueFactory<>("Ciudad"));
        tablaProyectos.setItems(proyectoslist);
    }

    private void dataTercerinforme(){
        //Traemos la tabla ObservableList del modelo
        var tercerInformeDao = new TercerInformeDao();
        ObservableList<TercerInformeVo> compraslist = tercerInformeDao.getTercerInforme();

        ID_Compra.setCellValueFactory(new PropertyValueFactory<>("ID_Compra"));
        Proveedor.setCellValueFactory(new PropertyValueFactory<>("Proveedor"));
        CiudadCompra.setCellValueFactory(new PropertyValueFactory<>("Ciudad"));
        ConstructoraCompra.setCellValueFactory(new PropertyValueFactory<>("Constructora"));
        Banco_Vinculado.setCellValueFactory(new PropertyValueFactory<>("Banco_Vinculado"));
        tablaCompras.setItems(compraslist);
    }
}