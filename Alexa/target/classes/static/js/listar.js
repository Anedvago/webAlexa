$(function(){
    verDetalles();//muestra los detalles del propietario.
    $('[data-toggle="popover"]').popover({html:true});//inicializa la ventana flotante, que admite eqtiquetas html. 
    $('.carousel').carousel();//inicializa el carrusel de la pagina inicio.
});

function verDetalles(){
	$("#listado").on("click",'.ver',function(e){
		e.preventDefault();
		$('#myModal').modal();
		var id = $(this).attr("name");
		var nombre = $("#nombre");
		var pnombre = $("#nombrep");
		var apellido = $("#apellido");
		var direccion = $("#direccion");
		var telefono = $("#telefono");
		var idhidden = $("#idA");
		var boton = $("#agregar");
		console.log(id);
		$.ajax({
			type:"GET",
			url:"/datos-propietario/"+id,
			success:function(persona){
				idhidden.val(persona.id)
				nombre.val(persona.nombre);
				apellido.val(persona.apellido);
				direccion.val(persona.direccion);
				telefono.val(persona.telefono);
				console.log(id,nombre.val());
				pnombre.html(persona.nombre);
			}
		});
	});
}
