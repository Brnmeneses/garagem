
$(document).ready(function(){

    $('.nBtn').show();
    $('#div1').hide();

    $('.nBtn, .table .eBtn').on('click',function(event){

        event.preventDefault();

        var href = $(this).attr('href');
        var text = $(this).text();

        var text = $(this).text();

        $('#div1').show();
        $('.nBtn').hide();

        if (text == 'Edit'){

            $.get(href,function(miniatura,status){

                $('#bForm #id').val(miniatura.id);
                $('#bForm #colecao').val(miniatura.colecao).focus();
                $('#bForm #fabricante_id').val(miniatura.fabricante_id.id).change();
                $('#bForm #ano').val(miniatura.ano);
                $('#bForm #cor').val(miniatura.cor);
                $('#bForm #modelo_id').val(miniatura.modelo_id.id).change();

                 $("html, body").animate({
                     scrollTop: 0
                 });

            });

        } else {

            $('#bForm #id').val('');
            $('#bForm #colecao').val('').focus();
            $('#bForm #fabricante_id').val(143).change();
            $('#bForm #ano').val('');
            $('#bForm #cor').val('Preto');
            $('#bForm #modelo_id').val('').change();

        }
    });

    $('.table .delBtn').on('click',function (event) {
         event.preventDefault();
         var href = $(this).attr('href');

         $('#divM #delRef').attr('href', href);
         $('#divM').modal();
    });

});