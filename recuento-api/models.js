const mongoose     = require('mongoose')

module.exports.Encuesta = mongoose.model('Encuesta', {
    nombre: String,
        cp: Number
})

module.exports.Pregunta = mongoose.model('Pregunta', {

    pregunta: String,
    encuesta: {
        type: mongoose.Schema.Types.ObjectId,
        ref: 'Encuesta'
    }
})

module.exports.Opcion = mongoose.model('Opcion', {
    recuento: Number,
    texto: String,
    pregunta: {
        type: mongoose.Schema.Types.ObjectId,
        ref: 'Pregunta'
    }
})