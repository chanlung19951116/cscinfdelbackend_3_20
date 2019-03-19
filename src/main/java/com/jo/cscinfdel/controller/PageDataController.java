package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.*;
import com.jo.cscinfdel.repository.*;
import com.jo.cscinfdel.security.JwtTokenUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/PageData")
public class PageDataController {

    @Autowired
    JwtTokenUtil tokenUtil;

    @Autowired
    UsuariosRepository usuariosRepository;

    @Autowired
    LibadoresRepository libadoresRepository;

    @Autowired
    LibadorRepository libadorRepository;

    @Autowired
    TipoProcedimientoRepository tipoProcedimientoRepository;

    @Autowired
    TipoResolucionRepository tipoResolucionRepository;

    @Autowired
    ParroquiaRepository parroquiaRepository;

    @Autowired
    CircuitoRepository circuitoRepository;

    @Autowired
    ZonaRepository zonaRepository;

    @Autowired
    DistritoRepository distritoRepository;

    @Autowired
    SexoRepository sexoRepository;

    @Autowired
    NacionalidadRepository nacionalidadRepository;

    @Autowired
    EtniaRepository etniaRepository;

    @Autowired
    EstadoCivilRepository estadoCivilRepository;

    @Autowired
    TipoDiscapacidadRepository tipoDiscapacidadRepository;

    @Autowired
    OcupacionRepository ocupacionRepository;

    @Autowired
    RegionRepository regionRepository;

    @Autowired
    RelacionAgresorRepository relacionAgresorRepository;

    @Autowired
    TipoEmpresaRepository tipoEmpresaRepository;

    @Autowired
    FiscaliaRepository fiscaliaRepository;

    @Autowired
    FiscalRepository fiscalRepository;

    @Autowired
    TipoPuntoRepository tipoPuntoRepository;

    @Autowired
    VictimaRepository victimaRepository;

    @Autowired
    DiaRepository diaRepository;

    @Autowired
    MesRepository mesRepository;

    @Autowired
    LugarRepository lugarRepository;

    @Autowired
    FrecuenciaAgresorRepository frecuenciaAgresorRepository;

    @Autowired
    BarrioRepository barrioRepository;

    @Autowired
    DatosGeoReferenciacionRepository datosGeoReferenciacionRepository;

    @Autowired
    TipoDelitoRepository tipoDelitoRepository;

    @Autowired
    VendedorRepository vendedorRepository;

    @Autowired
    LugarDonacionRepository lugarDonacionRepository;

    @Autowired
    ResponsableEscanerRepository responsableEscanerRepository;

    @Autowired
    TipoRiniaRepository tipoRiniaRepository;

    @Autowired
    GrupoFocalesRepository grupoFocalesRepository;

    @Autowired
    MecanismoAgresorRepository mecanismoAgresorRepository;

    @Autowired
    IndicioEstupefacientesRepository indicioEstupefacientesRepository;

    @Autowired
    GradoAlcoholAgresorRepository gradoAlcoholAgresorRepository;

    @Autowired
    ObjetoAgresionRepository objetoAgresionRepository;

    @Autowired
    TipoAgresionRepository tipoAgresionRepository;

    @Autowired
    AlcoholVictimaRepository alcoholVictimaRepository;

    @Autowired
    RangoLesionRepository rangoLesionRepository;

    @Autowired
    GradoAlcoholVictimaRepository gradoAlcoholVictimaRepository;

    @Autowired
    ArmMedioSucesoRepository armMedicoSucesoRepository;

    @Autowired
    LugarLevantamientoRepository lugarLevantamientoRepository;

    @Autowired
    LugarTrasladoRepository lugarTrasladoRepository;

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    MotivoMuerteRepository motivoMuerteRepository;

    @Autowired
    RestoVictimaRepository restoVictimaRepository;

    @Autowired
    TipoMuerteRepository tipoMuerteRepository;

    @Autowired
    AlcoholAgresorRepository alcoholAgresorRepository;

    @Autowired
    DsContinuidadCasoRepository dsContinuidadCasoRepository;

    @Autowired
    CausaAmenazaRepository causaAmenazaRepository;

    @Autowired
    TipoAmenazaRepository tipoAmenazaRepository;

    @Autowired
    AmAlcoholAgresorRepository amAlcoholAgresorRepository;

    @Autowired
    AmGradoAlcoholAgresorRepository amGradoAlcoholAgresorRepository;

    @Autowired
    AmTipoAmenazaRepository amTipoAmenazaRepository;

    @Autowired
    QuienCometeDelitoRepository quienCometeDelitoRepository;

    @Autowired
    MarcaVehiculoRepository marcaVehiculoRepository;

    @Autowired
    ColorVehiculoRepository colorVehiculoRepository;

    @Autowired
    ModeloVehiculoRepository modeloVehiculoRepository;

    @Autowired
    ServicioVehiculoRepository servicioVehiculoRepository;

    @Autowired
    TipoEmpresaVehiculoRepository tipoEmpresaVehiculoRepository;

    @Autowired
    TipoVehiculoRepository tipoVehiculoRepository;

    @Autowired
    AutorDelitoRepository autorDelitoRepository;

    @Autowired
    ModalidadRoboRepository modalidadRoboRepository;

    @Autowired
    ObjetoRobadoVehiculoRepository objetoRobadoVehiculoRepository;

    @Autowired
    VehiculoRepository vehiculoRepository;

    @Autowired
    ParteRobadaVehiculoRepository parteRobadaVehiculoRepository;

    @Autowired
    MomentoAccidenteRepository momentoAccidenteRepository;

    @Autowired
    TipoViaRepository tipoViaRepository;

    @Autowired
    CondicionCalzadaRepository condicionCalzadaRepository;

    @Autowired
    ClaseAccidenteRepository claseAccidenteRepository;

    @Autowired
    CausaAccidenteRepository causaAccidenteRepository;

    @Autowired
    ProcedenciaParteRepository procedenciaParteRepository;

    @Autowired
    PdCondicionRegresaDesaparecidoRepository pdCondicionRegresaDesaparecidoRepository;

    @Autowired
    ParroquiaDesaparicionRepository parroquiaDesaparicionRepository;

    @Autowired
    LesionesRepository lesionesRepository;


    @Autowired
    AfectadoRepository afectadoRepository;

    @Autowired
    ModalidadDelitoRepository modalidadDelitoRepository;

    @Autowired
    ObjetoHurtadoRepository objetoHurtadoRepository;

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    RolRepository rolRepository;

    @Getter
    @Setter
    @AllArgsConstructor()
    class LibadoresPageResponse {
        List<TipoProcedimiento> tipoProcedimientoList;
        List<TipoResolucion> tipoResolucionList;
        List<Parroquia> parroquiaList;
    }

    @RequestMapping(value = "/libadores", method = RequestMethod.GET)
    public LibadoresPageResponse libadores() {

        return new LibadoresPageResponse(
                this.tipoProcedimientoRepository.findAll(),
                this.tipoResolucionRepository.findAll(),
                this.parroquiaRepository.findAll()
        );
    }

    @Getter
    @Setter
    @AllArgsConstructor()
    class DatosGeoReferenciacionPageResponse {
        List<Parroquia> parroquiaList;
        List<Zona> zonaList;
        List<Circuito> circuitoList;
        List<Distrito> distritoList;
    }

    @RequestMapping(value = "/datosGeoReferenciacion", method = RequestMethod.GET)
    public DatosGeoReferenciacionPageResponse datosGeoReferenciacion() {

        return new DatosGeoReferenciacionPageResponse(
                this.parroquiaRepository.findAll(),
                this.zonaRepository.findAll(),
                this.circuitoRepository.findAll(),
                this.distritoRepository.findAll()
        );
    }

    @Getter
    @Setter
    @AllArgsConstructor()
    class AgresorPageResponse {
        List<Sexo> sexoList;
        List<Nacionalidad> nacionalidadList;
        List<Etnia> etniaList;
        List<EstadoCivil> estadoCivilList;
        List<TipoDiscapacidad> tipoDiscapacidadList;
        List<Ocupacion> ocupacionList;
        List<Region> regionList;
        List<RelacionAgresor> relacionAgresorList;
    }

    @RequestMapping(value = "/agresor", method = RequestMethod.GET)
    public AgresorPageResponse agresor() {

        return new AgresorPageResponse(
                sexoRepository.findAll(),
                nacionalidadRepository.findAll(),
                etniaRepository.findAll(),
                estadoCivilRepository.findAll(),
                tipoDiscapacidadRepository.findAll(),
                ocupacionRepository.findAll(),
                regionRepository.findAll(),
                relacionAgresorRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class VictimaPageResponse {
        List<Sexo> sexoList;
        List<Nacionalidad> nacionalidadList;
        List<Etnia> etniaList;
        List<EstadoCivil> estadoCivilList;
        List<TipoDiscapacidad> tipoDiscapacidadList;
        List<Ocupacion> ocupacionList;
        List<TipoEmpresa> tipoEmpresaList;
    }

    @RequestMapping(value = "/victima", method = RequestMethod.GET)
    public VictimaPageResponse victima() {

        return new VictimaPageResponse(
                sexoRepository.findAll(),
                nacionalidadRepository.findAll(),
                etniaRepository.findAll(),
                estadoCivilRepository.findAll(),
                tipoDiscapacidadRepository.findAll(),
                ocupacionRepository.findAll(),
                tipoEmpresaRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class ViolenciaIntraFamiliarResponse {
        List<Fiscalia> fiscaliaList;
        List<Fiscal> fiscalList;
        List<TipoPunto> tipoPuntoList;
        List<Dia> diaList;
        List<Mes> mesList;
        List<Parroquia> parroquiaList;
        List<Lugar> lugarList;
        List<FrecuenciaAgresor> frecuenciaAgresorList;
        List<Barrio> barrioList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
        List<TipoDelito> tipoDelitoList;
    }

    @RequestMapping(value = "/violenciaIntraFamiliar", method = RequestMethod.GET)
    public ViolenciaIntraFamiliarResponse violenciaIntraFamiliar() {

        return new ViolenciaIntraFamiliarResponse(
                fiscaliaRepository.findAll(),
                fiscalRepository.findAll(),
                tipoPuntoRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll(),
                parroquiaRepository.findAll(),
                lugarRepository.findAll(),
                frecuenciaAgresorRepository.findAll(),
                barrioRepository.findAll(),
                datosGeoReferenciacionRepository.findAll(),
                tipoDelitoRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class BarrioResponse {
        List<Parroquia> parroquiaList;
    }

    @RequestMapping(value = "/barrio", method = RequestMethod.GET)
    public BarrioResponse barrio() {

        return new BarrioResponse(
                parroquiaRepository.findAll()
        );
    }

    @Getter
    @Setter
    @AllArgsConstructor()
    class DecomisosResponse {
        List<TipoProcedimiento> tipoProcedimientoList;
        List<LugarDonacion> lugarDonacionList;
        List<Parroquia> parroquiaList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
    }

    @RequestMapping(value = "/decomisos", method = RequestMethod.GET)
    public DecomisosResponse decomisos() {

        return new DecomisosResponse(
                tipoProcedimientoRepository.findAll(),
                lugarDonacionRepository.findAll(),
                parroquiaRepository.findAll(),
                datosGeoReferenciacionRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class LesionesResponse {
        List<TipoPunto> tipoPuntoList;
        List<ResponsableEscaner> responsableEscanerList;
        List<Fiscalia> fiscaliaList;
        List<Fiscal> fiscalList;
        List<Parroquia> parroquiaList;
        List<Barrio> barrioList;
        List<TipoRinia> tipoRiniaList;
        List<GrupoFocales> grupoFocalesList;
        List<MecanismoAgresor> mecanismoAgresorList;
        List<Dia> diaList;
        List<Mes> mesList;
        List<Lugar> lugarList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;

        List<RelacionAgresor> relacionAgresorList;
        List<IndicioEstupefacientes> indicioEstupefacientesList;
        List<GradoAlcoholAgresor> gradoAlcoholAgresorList;
        List<ObjetoAgresion> objetoAgresionList;
        List<TipoAgresion> tipoAgresionList;

        List<RangoLesion> rangoLesionList;
        List<GradoAlcoholVictima> gradoAlcoholVictimaList;

    }

    @RequestMapping(value = "/lesiones", method = RequestMethod.GET)
    public LesionesResponse lesiones() {

        return new LesionesResponse(
                tipoPuntoRepository.findAll(),
                responsableEscanerRepository.findAll(),
                fiscaliaRepository.findAll(),
                fiscalRepository.findAll(),
                parroquiaRepository.findAll(),
                barrioRepository.findAll(),
                tipoRiniaRepository.findAll(),
                grupoFocalesRepository.findAll(),
                mecanismoAgresorRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll(),
                lugarRepository.findAll(),
                datosGeoReferenciacionRepository.findAll(),

                relacionAgresorRepository.findAll(),
                indicioEstupefacientesRepository.findAll(),
                gradoAlcoholAgresorRepository.findAll(),
                objetoAgresionRepository.findAll(),
                tipoAgresionRepository.findAll(),

                rangoLesionRepository.findAll(),
                gradoAlcoholVictimaRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class MuertesViolentasResponse {

        List<ArmMedioSuceso> armMedioSucesoList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
        List<Fiscal> fiscalList;
        List<Fiscalia> fiscaliaList;
        List<LugarLevantamiento> lugarLevantamientoList;
        List<LugarTraslado> lugarTrasladoList;
        List<Medico> medicoList;
        List<MotivoMuerte> motivoMuerteList;
        List<Parroquia> parroquiaList;
        List<RestoVictima> restoVictimaList;
        List<TipoMuerte> tipoMuerteList;
        List<AlcoholVictima> alcoholVictimaList;

        List<Dia> diaList;
        List<Mes> mesList;

    }

    @RequestMapping(value = "/muertesViolentas", method = RequestMethod.GET)
    public MuertesViolentasResponse muertesViolentas() {

        return new MuertesViolentasResponse(
                armMedicoSucesoRepository.findAll(),
                datosGeoReferenciacionRepository.findAll(),
                fiscalRepository.findAll(),
                fiscaliaRepository.findAll(),
                lugarLevantamientoRepository.findAll(),
                lugarTrasladoRepository.findAll(),
                medicoRepository.findAll(),
                motivoMuerteRepository.findAll(),
                parroquiaRepository.findAll(),
                restoVictimaRepository.findAll(),
                tipoMuerteRepository.findAll(),
                alcoholVictimaRepository.findAll(),

                diaRepository.findAll(),
                mesRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class DelitosSexualesResponse {

        List<Parroquia> parroquiaList;
        List<AlcoholAgresor> alcoholAgresorList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
        List<DsContinuidadCaso> dsContinuidadCasoList;
        List<Fiscal> fiscalList;
        List<Fiscalia> fiscaliaList;
        List<GradoAlcoholAgresor> gradoAlcoholAgresorList;
        List<Lugar> lugarList;
        List<MecanismoAgresor> mecanismoAgresorList;
        List<ObjetoAgresion> objetoAgresionList;
        List<TipoAgresion> tipoAgresionList;
        List<TipoDelito> tipoDelitoList;
        List<TipoPunto> tipoPuntoList;

        List<Dia> diaList;
        List<Mes> mesList;

    }

    @RequestMapping(value = "/delitosSexuales", method = RequestMethod.GET)
    public DelitosSexualesResponse delitosSexuales() {

        return new DelitosSexualesResponse(
                parroquiaRepository.findAll(),
                alcoholAgresorRepository.findAll(),
                datosGeoReferenciacionRepository.findAll(),
                dsContinuidadCasoRepository.findAll(),
                fiscalRepository.findAll(),
                fiscaliaRepository.findAll(),
                gradoAlcoholAgresorRepository.findAll(),
                lugarRepository.findAll(),
                mecanismoAgresorRepository.findAll(),
                objetoAgresionRepository.findAll(),
                tipoAgresionRepository.findAll(),
                tipoDelitoRepository.findAll(),
                tipoPuntoRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll()

        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class AmenazasResponse {

        List<TipoPunto> tipoPuntoList;
        List<ResponsableEscaner> responsableEscanerList;
        List<Fiscalia> fiscaliaList;
        List<Fiscal> fiscalList;
        List<Barrio> barrioList;
        List<Parroquia> parroquiaList;
        List<Dia> diaList;
        List<Mes> mesList;
        List<Lugar> lugarList;
        List<CausaAmenaza> causaAmenazaList;
        List<AmTipoAmenaza> amTipoAmenazaList;
        List<RelacionAgresor> relacionAgresorList;
        List<AmAlcoholAgresor> amAlcoholAgresorList;
        List<AmGradoAlcoholAgresor> amGradoAlcoholAgresorList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;

    }

    @RequestMapping(value = "/amenazas", method = RequestMethod.GET)
    public AmenazasResponse amenazas() {

        return new AmenazasResponse(
                tipoPuntoRepository.findAll(),
                responsableEscanerRepository.findAll(),
                fiscaliaRepository.findAll(),
                fiscalRepository.findAll(),
                barrioRepository.findAll(),
                parroquiaRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll(),
                lugarRepository.findAll(),
                causaAmenazaRepository.findAll(),
                amTipoAmenazaRepository.findAll(),
                relacionAgresorRepository.findAll(),
                amAlcoholAgresorRepository.findAll(),
                amGradoAlcoholAgresorRepository.findAll(),
                datosGeoReferenciacionRepository.findAll()
        );
    }

    @Getter
    @Setter
    @AllArgsConstructor()
    class MicroTraficoDrogaResponse {
        List<Parroquia> parroquiaList;
        List<Fiscalia> fiscaliaList;
        List<Fiscal> fiscalList;
        List<Dia> diaList;
        List<Mes> mesList;
        List<TipoDelito> tipoDelitoList;
        List<TipoProcedimiento> tipoProcedimientoList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
        List<QuienCometeDelito> quienCometeDelitoList;
        List<TipoPunto> tipoPuntoList;
    }

    @RequestMapping(value = "/microTraficoDroga", method = RequestMethod.GET)
    public MicroTraficoDrogaResponse microTraficoDroga() {

        return new MicroTraficoDrogaResponse(
                parroquiaRepository.findAll(),
                fiscaliaRepository.findAll(),
                fiscalRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll(),
                tipoDelitoRepository.findAll(),
                tipoProcedimientoRepository.findAll(),
                datosGeoReferenciacionRepository.findAll(),
                quienCometeDelitoRepository.findAll(),
                tipoPuntoRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class ModeloVehiculoResponse {
        List<MarcaVehiculo> marcaVehiculoList;
    }

    @RequestMapping(value = "/modeloVehiculo", method = RequestMethod.GET)
    public ModeloVehiculoResponse modeloVehiculo() {

        return new ModeloVehiculoResponse(
                marcaVehiculoRepository.findAll()
        );
    }

    @Getter
    @Setter
    @AllArgsConstructor()
    class VehiculoResponse {
        List<ColorVehiculo> colorVehiculoList;
        List<MarcaVehiculo> marcaVehiculoList;
        List<ModeloVehiculo> modeloVehiculoList;
        List<ServicioVehiculo> servicioVehiculoList;
        List<TipoEmpresaVehiculo> tipoEmpresaVehiculoList;
        List<TipoVehiculo> tipoVehiculoList;
    }

    @RequestMapping(value = "/vehiculo", method = RequestMethod.GET)
    public VehiculoResponse vehiculo() {

        return new VehiculoResponse(
                colorVehiculoRepository.findAll(),
                marcaVehiculoRepository.findAll(),
                modeloVehiculoRepository.findAll(),
                servicioVehiculoRepository.findAll(),
                tipoEmpresaVehiculoRepository.findAll(),
                tipoVehiculoRepository.findAll()
        );
    }

    @Getter
    @Setter
    @AllArgsConstructor()
    class RobosVehiculosResponse {
        List<Parroquia> parroquiaList;
        List<TipoPunto> tipoPuntoList;
        List<ResponsableEscaner> responsableEscanerList;
        List<Fiscalia> fiscaliaList;
        List<Fiscal> fiscalList;
        List<Dia> diaList;
        List<Mes> mesList;
        List<Lugar> lugarList;
        List<TipoDelito> tipoDelitoList;
        List<AutorDelito> autorDelitoList;
        List<TipoAgresion> tipoAgresionList;
        List<ModalidadRobo> modalidadRoboList;
        List<ObjetoRobadoVehiculo> objetoRobadoVehiculoList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
        List<Vehiculo> vehiculoList;
        List<ParteRobadaVehiculo> parteRobadaVehiculoList;
    }

    @RequestMapping(value = "/robosVehiculos", method = RequestMethod.GET)
    public RobosVehiculosResponse robosVehiculos() {

        return new RobosVehiculosResponse(
                parroquiaRepository.findAll(),
                tipoPuntoRepository.findAll(),
                responsableEscanerRepository.findAll(),
                fiscaliaRepository.findAll(),
                fiscalRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll(),
                lugarRepository.findAll(),
                tipoDelitoRepository.findAll(),
                autorDelitoRepository.findAll(),
                tipoAgresionRepository.findAll(),
                modalidadRoboRepository.findAll(),
                objetoRobadoVehiculoRepository.findAll(),
                datosGeoReferenciacionRepository.findAll(),
                vehiculoRepository.findAll(),
                parteRobadaVehiculoRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class AccidenteTransitoResponse {
        List<TipoPunto> tipoPuntoList;
        List<Fiscalia> fiscaliaList;
        List<Fiscal> fiscalList;
        List<Barrio> barrioList;
        List<Parroquia> parroquiaList;
        List<Dia> diaList;
        List<Mes> mesList;
        List<ProcedenciaParte> procedenciaParteList;
        List<Lugar> lugarList;
        List<MomentoAccidente> momentoAccidenteList;
        List<TipoVia> tipoViaList;
        List<CondicionCalzada> condicionCalzadaList;
        List<ClaseAccidente> claseAccidenteList;
        List<CausaAccidente> causaAccidenteList;
        List<Vehiculo> vehiculoList;
        List<AlcoholVictima> alcoholVictimaList;
        List<GradoAlcoholVictima> gradoAlcoholVictimaList;
        List<AlcoholAgresor> alcoholAgresorList;
        List<GradoAlcoholAgresor> gradoAlcoholAgresorList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
    }

    @RequestMapping(value = "/accidenteTransito", method = RequestMethod.GET)
    public AccidenteTransitoResponse accidenteTransito() {

        return new AccidenteTransitoResponse(
                tipoPuntoRepository.findAll(),
                fiscaliaRepository.findAll(),
                fiscalRepository.findAll(),
                barrioRepository.findAll(),
                parroquiaRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll(),
                procedenciaParteRepository.findAll(),
                lugarRepository.findAll(),
                momentoAccidenteRepository.findAll(),
                tipoViaRepository.findAll(),
                condicionCalzadaRepository.findAll(),
                claseAccidenteRepository.findAll(),
                causaAccidenteRepository.findAll(),
                vehiculoRepository.findAll(),
                alcoholVictimaRepository.findAll(),
                gradoAlcoholVictimaRepository.findAll(),
                alcoholAgresorRepository.findAll(),
                gradoAlcoholAgresorRepository.findAll(),
                datosGeoReferenciacionRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class PersonasDesaparecidasResponse {
        List<ParroquiaDesaparicion> parroquiaDesaparicionList;
        List<Fiscalia> fiscaliaList;
        List<Fiscal> fiscalList;
        List<Dia> diaList;
        List<Mes> mesList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
        List<TipoPunto> tipoPuntoList;
        List<PdCondicionRegresaDesaparecido> pdCondicionRegresaDesaparecidoList;
    }

    @RequestMapping(value = "/personasDesaparecidas", method = RequestMethod.GET)
    public PersonasDesaparecidasResponse personasDesaparecidas() {

        return new PersonasDesaparecidasResponse(
                parroquiaDesaparicionRepository.findAll(),
                fiscaliaRepository.findAll(),
                fiscalRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll(),
                datosGeoReferenciacionRepository.findAll(),
                tipoPuntoRepository.findAll(),
                pdCondicionRegresaDesaparecidoRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class GradoAlcoholVictimaResponse {
        List<AlcoholVictima> alcoholVictimaList;
    }

    @RequestMapping(value = "/gradoAlcoholVictima", method = RequestMethod.GET)
    public GradoAlcoholVictimaResponse gradoAlcoholVictima() {

        return new GradoAlcoholVictimaResponse(
                alcoholVictimaRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class OtrosDelitosResponse {

        List<Parroquia> parroquiaList;
        List<Fiscalia> fiscaliaList;
        List<Fiscal> fiscalList;
        List<Dia> diaList;
        List<Mes> mesList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
    }

    @RequestMapping(value = "/otrosDelitos", method = RequestMethod.GET)
    public OtrosDelitosResponse otrosDelitos() {

        return new OtrosDelitosResponse(
                parroquiaRepository.findAll(),
                fiscaliaRepository.findAll(),
                fiscalRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll(),
                datosGeoReferenciacionRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class LesionAgresorResponse {

        List<Lesiones> lesionesList;
        List<RelacionAgresor> relacionAgresorList;
        List<IndicioEstupefacientes> indicioEstupefacientesList;
        List<GradoAlcoholAgresor> gradoAlcoholAgresorList;
        List<ObjetoAgresion> objetoAgresionList;
        List<TipoAgresion> tipoAgresionList;
    }

    @RequestMapping(value = "/lesionAgresor", method = RequestMethod.GET)
    public LesionAgresorResponse lesionAgresorResponse() {

        List<Lesiones> lesionesList = lesionesRepository.findAll();

        lesionesList.forEach(lesiones -> {
            lesiones.setLesionAgresorList(null);
            lesiones.setLesionVictimaList(null);
        });

        return new LesionAgresorResponse(
                lesionesList,
                relacionAgresorRepository.findAll(),
                indicioEstupefacientesRepository.findAll(),
                gradoAlcoholAgresorRepository.findAll(),
                objetoAgresionRepository.findAll(),
                tipoAgresionRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class LesionVictimaResponse {

        List<Lesiones> lesionesList;
        List<RangoLesion> rangoLesionList;
        List<IndicioEstupefacientes> indicioEstupefacientesList;
        List<GradoAlcoholVictima> gradoAlcoholVictimaList;
    }

    @RequestMapping(value = "/lesionVictima", method = RequestMethod.GET)
    public LesionVictimaResponse lesionVictimaResponse() {

        List<Lesiones> lesionesList = lesionesRepository.findAll();

        lesionesList.forEach(lesiones -> {
            lesiones.setLesionAgresorList(null);
            lesiones.setLesionVictimaList(null);
        });

        return new LesionVictimaResponse(
                lesionesList,
                rangoLesionRepository.findAll(),
                indicioEstupefacientesRepository.findAll(),
                gradoAlcoholVictimaRepository.findAll()
        );
    }

    @Getter
    @Setter
    @AllArgsConstructor()
    class RobosHurtosGeneralResponse {


        List<Parroquia> parroquiaList;
        List<TipoPunto> tipoPuntoList;
        List<ResponsableEscaner> responsableEscanerList;
        List<Fiscalia> fiscaliaList;
        List<Fiscal> fiscalList;
        List<Dia> diaList;
        List<Mes> mesList;
        List<TipoDelito> tipoDelitoList;
        List<Afectado> afectadoList;
        List<Lugar> lugarList;
        List<AutorDelito> autorDelitoList;
        List<ModalidadDelito> modalidadDelitoList;
        List<TipoAgresion> tipoAgresionList;
        List<ObjetoAgresion> objetoAgresionList;
        List<ObjetoRobadoVehiculo> objetoRobadoVehiculoList;
        List<DatosGeoReferenciacion> datosGeoReferenciacionList;
        List<ObjetoHurtado> objetoHurtadoList;
    }

    @RequestMapping(value = "/robosHurtosGeneral", method = RequestMethod.GET)
    public RobosHurtosGeneralResponse robosHurtosGeneral() {

        return new RobosHurtosGeneralResponse(
                parroquiaRepository.findAll(),
                tipoPuntoRepository.findAll(),
                responsableEscanerRepository.findAll(),
                fiscaliaRepository.findAll(),
                fiscalRepository.findAll(),
                diaRepository.findAll(),
                mesRepository.findAll(),
                tipoDelitoRepository.findAll(),
                afectadoRepository.findAll(),
                lugarRepository.findAll(),
                autorDelitoRepository.findAll(),
                modalidadDelitoRepository.findAll(),
                tipoAgresionRepository.findAll(),
                objetoAgresionRepository.findAll(),
                objetoRobadoVehiculoRepository.findAll(),
                datosGeoReferenciacionRepository.findAll(),
                objetoHurtadoRepository.findAll()
        );
    }


    @Getter
    @Setter
    @AllArgsConstructor()
    class MenuRolResponse {

        List<Menu> menuList;
        List<Rol> rolList;

    }

    @RequestMapping(value = "/menuRol", method = RequestMethod.GET)
    public MenuRolResponse menuRol() {

        List<Rol> rolList = rolRepository.findAll();
        rolList.forEach(rol -> {
            rol.setMenuRolList(null);
        });

        return new MenuRolResponse(
                menuRepository.findAll(),
                rolRepository.findAll()
        );
    }

    @Getter
    @Setter
    @AllArgsConstructor()
    class UsuariosResponse {

        List<Rol> rolList;

    }

    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public UsuariosResponse usuarios() {

        List<Rol> rolList = rolRepository.findAll();
        rolList.forEach(rol -> {
            rol.setMenuRolList(null);
        });

        return new UsuariosResponse(
                rolRepository.findAll()
        );
    }
}
